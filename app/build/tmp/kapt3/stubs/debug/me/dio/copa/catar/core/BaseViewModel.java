package me.dio.copa.catar.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0005J\u0015\u0010\u0015\u001a\u00020\u00162\u0006\u0010\n\u001a\u00028\u0001H\u0004\u00a2\u0006\u0002\u0010\u0005J!\u0010\u0017\u001a\u00020\u00162\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0019\u00a2\u0006\u0002\b\u001aH\u0004R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00028\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001b"}, d2 = {"Lme/dio/copa/catar/core/BaseViewModel;", "UiState", "UiAction", "Landroidx/lifecycle/ViewModel;", "initialState", "(Ljava/lang/Object;)V", "_action", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "action", "Lkotlinx/coroutines/flow/SharedFlow;", "getAction", "()Lkotlinx/coroutines/flow/SharedFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "stateValue", "getStateValue", "()Ljava/lang/Object;", "sendAction", "", "setState", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "app_debug"})
public abstract class BaseViewModel<UiState extends java.lang.Object, UiAction extends java.lang.Object> extends androidx.lifecycle.ViewModel {
    private final kotlinx.coroutines.flow.MutableStateFlow<UiState> _state = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<UiState> state = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<UiAction> _action = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.SharedFlow<UiAction> action = null;
    
    public BaseViewModel(UiState initialState) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<UiState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<UiAction> getAction() {
        return null;
    }
    
    public final UiState getStateValue() {
        return null;
    }
    
    protected final void setState(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super UiState, ? extends UiState> block) {
    }
    
    protected final void sendAction(UiAction action) {
    }
}