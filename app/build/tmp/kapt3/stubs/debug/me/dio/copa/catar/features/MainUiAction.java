package me.dio.copa.catar.features;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lme/dio/copa/catar/features/MainUiAction;", "", "DisableNotification", "EnableNotification", "MatchesNotFound", "Unexpected", "Lme/dio/copa/catar/features/MainUiAction$DisableNotification;", "Lme/dio/copa/catar/features/MainUiAction$EnableNotification;", "Lme/dio/copa/catar/features/MainUiAction$MatchesNotFound;", "Lme/dio/copa/catar/features/MainUiAction$Unexpected;", "app_debug"})
public abstract interface MainUiAction {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lme/dio/copa/catar/features/MainUiAction$Unexpected;", "Lme/dio/copa/catar/features/MainUiAction;", "()V", "app_debug"})
    public static final class Unexpected implements me.dio.copa.catar.features.MainUiAction {
        @org.jetbrains.annotations.NotNull
        public static final me.dio.copa.catar.features.MainUiAction.Unexpected INSTANCE = null;
        
        private Unexpected() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lme/dio/copa/catar/features/MainUiAction$MatchesNotFound;", "Lme/dio/copa/catar/features/MainUiAction;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class MatchesNotFound implements me.dio.copa.catar.features.MainUiAction {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String message = null;
        
        @org.jetbrains.annotations.NotNull
        public final me.dio.copa.catar.features.MainUiAction.MatchesNotFound copy(@org.jetbrains.annotations.NotNull
        java.lang.String message) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public MatchesNotFound(@org.jetbrains.annotations.NotNull
        java.lang.String message) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getMessage() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0003J\u0017\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lme/dio/copa/catar/features/MainUiAction$EnableNotification;", "Lme/dio/copa/catar/features/MainUiAction;", "match", "Lme/dio/copa/catar/domain/model/Match;", "Lme/dio/copa/catar/domain/model/MatchDomain;", "(Lme/dio/copa/catar/domain/model/Match;)V", "getMatch", "()Lme/dio/copa/catar/domain/model/Match;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class EnableNotification implements me.dio.copa.catar.features.MainUiAction {
        @org.jetbrains.annotations.NotNull
        private final me.dio.copa.catar.domain.model.Match match = null;
        
        @org.jetbrains.annotations.NotNull
        public final me.dio.copa.catar.features.MainUiAction.EnableNotification copy(@org.jetbrains.annotations.NotNull
        me.dio.copa.catar.domain.model.Match match) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public EnableNotification(@org.jetbrains.annotations.NotNull
        me.dio.copa.catar.domain.model.Match match) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final me.dio.copa.catar.domain.model.Match component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final me.dio.copa.catar.domain.model.Match getMatch() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0003J\u0017\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lme/dio/copa/catar/features/MainUiAction$DisableNotification;", "Lme/dio/copa/catar/features/MainUiAction;", "match", "Lme/dio/copa/catar/domain/model/Match;", "Lme/dio/copa/catar/domain/model/MatchDomain;", "(Lme/dio/copa/catar/domain/model/Match;)V", "getMatch", "()Lme/dio/copa/catar/domain/model/Match;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class DisableNotification implements me.dio.copa.catar.features.MainUiAction {
        @org.jetbrains.annotations.NotNull
        private final me.dio.copa.catar.domain.model.Match match = null;
        
        @org.jetbrains.annotations.NotNull
        public final me.dio.copa.catar.features.MainUiAction.DisableNotification copy(@org.jetbrains.annotations.NotNull
        me.dio.copa.catar.domain.model.Match match) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public DisableNotification(@org.jetbrains.annotations.NotNull
        me.dio.copa.catar.domain.model.Match match) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final me.dio.copa.catar.domain.model.Match component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final me.dio.copa.catar.domain.model.Match getMatch() {
            return null;
        }
    }
}