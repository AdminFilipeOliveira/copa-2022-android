package me.dio.copa.catar.features;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lme/dio/copa/catar/features/MainViewModel;", "Lme/dio/copa/catar/core/BaseViewModel;", "Lme/dio/copa/catar/features/MainUiState;", "Lme/dio/copa/catar/features/MainUiAction;", "getMatchesUseCase", "Lme/dio/copa/catar/domain/usecase/GetMatchesUseCase;", "disableNotificationUseCase", "Lme/dio/copa/catar/domain/usecase/DisableNotificationUseCase;", "enableNotificationUseCase", "Lme/dio/copa/catar/domain/usecase/EnableNotificationUseCase;", "(Lme/dio/copa/catar/domain/usecase/GetMatchesUseCase;Lme/dio/copa/catar/domain/usecase/DisableNotificationUseCase;Lme/dio/copa/catar/domain/usecase/EnableNotificationUseCase;)V", "fetchMatches", "Lkotlinx/coroutines/Job;", "toggleNotification", "", "match", "Lme/dio/copa/catar/domain/model/Match;", "app_debug"})
public final class MainViewModel extends me.dio.copa.catar.core.BaseViewModel<me.dio.copa.catar.features.MainUiState, me.dio.copa.catar.features.MainUiAction> {
    private final me.dio.copa.catar.domain.usecase.GetMatchesUseCase getMatchesUseCase = null;
    private final me.dio.copa.catar.domain.usecase.DisableNotificationUseCase disableNotificationUseCase = null;
    private final me.dio.copa.catar.domain.usecase.EnableNotificationUseCase enableNotificationUseCase = null;
    
    @javax.inject.Inject
    public MainViewModel(@org.jetbrains.annotations.NotNull
    me.dio.copa.catar.domain.usecase.GetMatchesUseCase getMatchesUseCase, @org.jetbrains.annotations.NotNull
    me.dio.copa.catar.domain.usecase.DisableNotificationUseCase disableNotificationUseCase, @org.jetbrains.annotations.NotNull
    me.dio.copa.catar.domain.usecase.EnableNotificationUseCase enableNotificationUseCase) {
        super(null);
    }
    
    private final kotlinx.coroutines.Job fetchMatches() {
        return null;
    }
    
    public final void toggleNotification(@org.jetbrains.annotations.NotNull
    me.dio.copa.catar.domain.model.Match match) {
    }
}