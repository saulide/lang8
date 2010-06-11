package com.tangledcode.lang8.client.presenter;

import org.enunes.gwt.mvp.client.EventBus;
import org.enunes.gwt.mvp.client.presenter.BasePresenter;
import org.enunes.gwt.mvp.client.presenter.Presenter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.tangledcode.lang8.client.CurrentUser;
import com.tangledcode.lang8.client.dto.AuthenticationResponse;
import com.tangledcode.lang8.client.dto.GroupDTO;
import com.tangledcode.lang8.client.dto.UserDTO;
import com.tangledcode.lang8.client.event.GroupClickEvent;
import com.tangledcode.lang8.client.event.GroupClickHandler;
import com.tangledcode.lang8.client.event.LoginClickEvent;
import com.tangledcode.lang8.client.event.LoginClickHandler;
import com.tangledcode.lang8.client.event.LogoutClickEvent;
import com.tangledcode.lang8.client.event.LogoutClickHandler;
import com.tangledcode.lang8.client.event.NewGroupEvent;
import com.tangledcode.lang8.client.event.NewGroupHandler;
import com.tangledcode.lang8.client.event.RegistrationClickEvent;
import com.tangledcode.lang8.client.event.RegistrationClickHandler;
import com.tangledcode.lang8.client.event.ResetRegistrationEvent;
import com.tangledcode.lang8.client.event.ResetRegistrationHandler;
import com.tangledcode.lang8.client.event.TextClickEvent;
import com.tangledcode.lang8.client.event.TextClickHandler;
import com.tangledcode.lang8.client.event.UserLoggedInEvent;
import com.tangledcode.lang8.client.event.UserLoggedInHandler;
import com.tangledcode.lang8.client.event.UserLoggedOutEvent;
import com.tangledcode.lang8.client.event.UserLoginEvent;
import com.tangledcode.lang8.client.event.UserLoginHandler;
import com.tangledcode.lang8.client.event.UserRegistrationEvent;
import com.tangledcode.lang8.client.event.UserRegistrationHandler;
import com.tangledcode.lang8.client.model.Group;
import com.tangledcode.lang8.client.model.User;
import com.tangledcode.lang8.client.presenter.MainPresenter.Display;
import com.tangledcode.lang8.client.service.GroupService;
import com.tangledcode.lang8.client.service.GroupServiceAsync;
import com.tangledcode.lang8.client.service.UserService;
import com.tangledcode.lang8.client.service.UserServiceAsync;

public class MainPresenterImp extends BasePresenter<Display> implements MainPresenter {

    private final Provider<RegistrationPresenter> registrationProvider;
    private final Provider<LoginPresenter> loginProvider;
    private final Provider<ProfilePresenter> profileProvider;
    private final Provider<GroupPresenter> groupProvider;
    private final Provider<TextPresenter> textProvider;
    
    private Presenter<? extends org.enunes.gwt.mvp.client.view.Display> presenter;
    
    private UserServiceAsync userSvc = GWT.create(UserService.class);
    private GroupServiceAsync groupSvc = GWT.create(GroupService.class);

    @Inject
    public MainPresenterImp(EventBus eventBus, Display display, MenuPresenter menuPresenter, 
            Provider<RegistrationPresenter> registrationProvider,
            Provider<LoginPresenter> loginProvider,
            Provider<ProfilePresenter> profileProvider,
            Provider<GroupPresenter> groupProvider,
            Provider<TextPresenter> textProvider) {
        super(eventBus, display);

        this.registrationProvider = registrationProvider;
        this.loginProvider = loginProvider;
        this.profileProvider = profileProvider;
        this.groupProvider = groupProvider;
        this.textProvider = textProvider;

        menuPresenter.bind();
        this.display.addMenu(menuPresenter.getDisplay());
    }

    private void switchPresenter(Presenter<? extends org.enunes.gwt.mvp.client.view.Display> presenter) {
        if(this.presenter != null) {
            this.presenter.unbind();
            display.removeContent();
        }

        this.presenter = presenter;

        if(presenter != null) {
            this.display.addContent(presenter.getDisplay());
            this.presenter.bind();
        }
    }

    @Override
    public void unbind() {
        super.unbind();
        if(this.presenter != null) {
            this.presenter.unbind();
        }
    }

    @Override
    public void bind() {
        super.bind();

        this.registerHandler(this.eventBus.addHandler(ResetRegistrationEvent.getType(), new ResetRegistrationHandler() {

            public void onResetRegistration(ResetRegistrationEvent event) {
                doResetRegistration();
            }
        }));

        this.registerHandler(this.eventBus.addHandler(UserRegistrationEvent.getType(), new UserRegistrationHandler() {

            public void onUserRegistration(UserRegistrationEvent event) {
                doUserRegistration(event.getUser());
            }
        }));

        this.registerHandler(this.eventBus.addHandler(UserLoginEvent.getType(), new UserLoginHandler() {

            public void onUserLogin(UserLoginEvent event) {
                doUserLogin(event.getUser());
            }
        }));
        
        this.registerHandler(this.eventBus.addHandler(UserLoggedInEvent.getType(), new UserLoggedInHandler() {
            
            public void onUserLoggedIn(UserLoggedInEvent event) {
                doUserLoggedIn();
            }
        }));

        // menu click events

        this.registerHandler(this.eventBus.addHandler(RegistrationClickEvent.getType(), new RegistrationClickHandler() {

            public void onRegistrationClick(RegistrationClickEvent event) {
                doRegistrationClick();
            }
        }));

        this.registerHandler(this.eventBus.addHandler(LoginClickEvent.getType(), new LoginClickHandler() {

            public void onLoginClick(LoginClickEvent event) {
                doLoginClick();
            }
        }));
        
        this.registerHandler(this.eventBus.addHandler(LogoutClickEvent.getType(), new LogoutClickHandler() {

            public void onLogoutClick(LogoutClickEvent event) {
                doLogoutClick();
            }
        }));

        this.registerHandler(this.eventBus.addHandler(ProfileClickEvent.getType(), new ProfileClickHandler() {

            public void onProfileClick(ProfileClickEvent event) {
                doProfileClick(event.getId());
            }
        }));
        
        this.registerHandler(this.eventBus.addHandler(GroupClickEvent.getType(), new GroupClickHandler() {
            
            public void onGroupClick(GroupClickEvent event) {
                doGroupClick();
            }
        }));
        
        this.registerHandler(this.eventBus.addHandler(NewGroupEvent.getType(), new NewGroupHandler() {
            
            public void onNewGroupClick(NewGroupEvent event) {
                doNewGroup(event.getGroup());
            }
        }));
        
        this.registerHandler(this.eventBus.addHandler(TextClickEvent.getType(), new TextClickHandler() {

            public void onTextClick(TextClickEvent event) {
                doTextClick();
            }
        }

        ));

        eventBus.fireEvent(new LoginClickEvent());
    }

    protected void doUserLoggedIn() {
        eventBus.fireEvent(new ProfileClickEvent(CurrentUser.getUser().getId()));
    }

    protected void doTextClick() {
        final TextPresenter presenter = this.textProvider.get();
        this.switchPresenter(presenter);
    }
    
    protected void doLoginClick() {
        final LoginPresenter presenter = this.loginProvider.get();
        this.switchPresenter(presenter);
    }
    
    protected void doLogoutClick() {
        CurrentUser.reset();
        doLoginClick();
        eventBus.fireEvent(new UserLoggedOutEvent());
    }

    protected void doRegistrationClick() {
        final RegistrationPresenter presenter = this.registrationProvider.get();
        this.switchPresenter(presenter);
    }
    
    protected void doGroupClick() {
        final GroupPresenter presenter = this.groupProvider.get();
        this.switchPresenter(presenter);
    }

    protected void doProfileClick(long id) {
        final ProfilePresenter presenter = this.profileProvider.get();
        this.switchPresenter(presenter);

        if(this.userSvc == null) {
            this.userSvc = GWT.create(UserService.class);
        }

        final AsyncCallback<UserDTO> callback = new AsyncCallback<UserDTO>() {

            public void onFailure(Throwable caught) {
            }

            public void onSuccess(UserDTO user) {
                presenter.setUser(new User(user));
            }
        };
        
        this.userSvc.getUser(id, CurrentUser.getSessionId(), callback);
    }
        
    protected void doNewGroup(Group group) {
        if(this.groupSvc == null) {
            this.groupSvc = GWT.create(GroupService.class);
        }
        
        AsyncCallback<Integer> callback = new AsyncCallback<Integer>() {
            
            public void onSuccess(Integer id) {
                System.out.println("New group is created!");
            }
            
            public void onFailure(Throwable caught) {
                System.out.println("Could not create new Group!");
            }

        };
        
        this.groupSvc.saveGroup(new GroupDTO(group), callback);
    }

    protected void doUserLogin(User user) {
        if(this.userSvc == null) {
            this.userSvc = GWT.create(UserService.class);
        }

        AsyncCallback<AuthenticationResponse> callback = new AsyncCallback<AuthenticationResponse>() {

            public void onFailure(Throwable caught) {
                System.out.println("could not login");
            }

            public void onSuccess(AuthenticationResponse response) {
                CurrentUser.setUser(response.getUser(), response.getSessionId());
                eventBus.fireEvent(new UserLoggedInEvent());
            }
        };

        this.userSvc.authenticate(user.getUsername(), user.getPassword(), callback);
    }

    protected void doUserRegistration(User user) {
        if(this.userSvc == null) {
            this.userSvc = GWT.create(UserService.class);
        }

        AsyncCallback<Long> callback = new AsyncCallback<Long>() {

            public void onFailure(Throwable caught) {
                System.err.println("could not reg");
            }
            
            public void onSuccess(Long id) {
                eventBus.fireEvent(new LoginClickEvent());
            }

        };

        this.userSvc.saveUser(new UserDTO(user), CurrentUser.getSessionId(), callback);
    }

    protected void doResetRegistration() {

    }

}
