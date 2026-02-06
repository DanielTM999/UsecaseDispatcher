package dtm.usecase.core;

import dtm.usecase.core.result.PidUseCaseResult;
import dtm.usecase.core.result.UseCaseResult;

import java.util.List;

public interface UseCaseDispatcher {
    List<PidUseCaseResult> dispatchList(Class<? extends UseCaseBase>... clazzList);
    List<PidUseCaseResult> dispatchList(List<Class<? extends UseCaseBase>> clazzList, Object... args);

    String dispatch(Class<? extends UseCaseBase> clazz);
    String dispatch(Class<? extends UseCaseBase> clazz, Object... args);
    String dispatch(String PID, Class<? extends UseCaseBase> clazz);
    String dispatch(String PID, Class<? extends UseCaseBase> clazz, Object... args);

    UseCaseResult getUseCase(String caseId);
}
