package dtm.usecase.core.result;

import dtm.usecase.core.UseCaseBase;

public interface PidUseCaseResult {
    String getGetPid();
    Class<? extends UseCaseBase> getReferenceClass();
}
