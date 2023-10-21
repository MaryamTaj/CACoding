package use_case.clear_users;

// TODO Complete me

import java.util.Set;

public class ClearOutputData {
    private final Set<String> users;
    private boolean useCaseFailed;

    public ClearOutputData(Set<String> users, boolean useCaseFailed) {
        this.users = users;
        this.useCaseFailed = useCaseFailed;
    }

    public Set<String> getMessage() {
        return users;
    }

}
