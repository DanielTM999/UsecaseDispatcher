package dtm.usecase.core;

@FunctionalInterface
public interface InstanceObjectDispatcherFactory {
    Object onCreate(Class<?> clazz) throws Exception;
}
