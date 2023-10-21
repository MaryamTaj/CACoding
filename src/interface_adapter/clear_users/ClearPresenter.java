package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import interface_adapter.clear_users.ClearState;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

import java.util.Set;
import java.util.StringJoiner;


public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;
    private ViewManagerModel viewManagerModel;

    public ClearPresenter(ViewManagerModel viewManagerModel,
                           ClearViewModel clearViewModel) {
        this.viewManagerModel = viewManagerModel;
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData clearOutputData) {
        // On success, switch to the sign up view.

        viewManagerModel.setActiveView(clearViewModel.getViewName());
        viewManagerModel.firePropertyChanged();
        Set<String> users = clearOutputData.getMessage();
        StringJoiner messageUsers = new StringJoiner(" ");
        for (String str : users){
            messageUsers.add(str);
        }
        ClearState clearState = clearViewModel.getState();
        String message = messageUsers.toString();
        clearState.setMessage(message);
    }

    @Override
    public void prepareFailView(String error) {
        ClearState clearState = clearViewModel.getState();
        clearState.setMessageError(error);
        clearViewModel.firePropertyChanged();
    }
}
