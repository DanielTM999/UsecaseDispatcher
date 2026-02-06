package dtm.usecase.results;

import dtm.usecase.core.result.PidUseCaseResult;
import dtm.usecase.core.UseCaseBase;

public final class PidUseCaseResultConcrete implements PidUseCaseResult {
    private final String getPid;
    private final Class<? extends UseCaseBase> referenceClass;

    public PidUseCaseResultConcrete(String getPid, Class<? extends UseCaseBase> referenceClass) {
        this.getPid = getPid;
        this.referenceClass = referenceClass;
    }

    @Override
    public String getGetPid() {
        return getPid;
    }

    @Override
    public Class<? extends UseCaseBase> getReferenceClass() {
        return referenceClass;
    }

    
}
