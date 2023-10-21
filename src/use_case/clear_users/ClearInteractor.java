package use_case.clear_users;

// TODO Complete me


import java.util.Set;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = userDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }

    @Override
    public void execute(ClearInputData clearInputData) {
        if (!userDataAccessObject.populated()) {
            clearPresenter.prepareFailView("FAILURE. There are no users to delete.");
        } else {
                Set<String> users = userDataAccessObject.clear();
                ClearOutputData clearOutputData = new ClearOutputData(users, false);
                clearPresenter.prepareSuccessView(clearOutputData);
            }
        }
    }

