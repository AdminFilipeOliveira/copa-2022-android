package me.dio.copa.catar.features;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import me.dio.copa.catar.domain.usecase.DisableNotificationUseCase;
import me.dio.copa.catar.domain.usecase.EnableNotificationUseCase;
import me.dio.copa.catar.domain.usecase.GetMatchesUseCase;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<GetMatchesUseCase> getMatchesUseCaseProvider;

  private final Provider<DisableNotificationUseCase> disableNotificationUseCaseProvider;

  private final Provider<EnableNotificationUseCase> enableNotificationUseCaseProvider;

  public MainViewModel_Factory(Provider<GetMatchesUseCase> getMatchesUseCaseProvider,
      Provider<DisableNotificationUseCase> disableNotificationUseCaseProvider,
      Provider<EnableNotificationUseCase> enableNotificationUseCaseProvider) {
    this.getMatchesUseCaseProvider = getMatchesUseCaseProvider;
    this.disableNotificationUseCaseProvider = disableNotificationUseCaseProvider;
    this.enableNotificationUseCaseProvider = enableNotificationUseCaseProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(getMatchesUseCaseProvider.get(), disableNotificationUseCaseProvider.get(), enableNotificationUseCaseProvider.get());
  }

  public static MainViewModel_Factory create(Provider<GetMatchesUseCase> getMatchesUseCaseProvider,
      Provider<DisableNotificationUseCase> disableNotificationUseCaseProvider,
      Provider<EnableNotificationUseCase> enableNotificationUseCaseProvider) {
    return new MainViewModel_Factory(getMatchesUseCaseProvider, disableNotificationUseCaseProvider, enableNotificationUseCaseProvider);
  }

  public static MainViewModel newInstance(GetMatchesUseCase getMatchesUseCase,
      DisableNotificationUseCase disableNotificationUseCase,
      EnableNotificationUseCase enableNotificationUseCase) {
    return new MainViewModel(getMatchesUseCase, disableNotificationUseCase, enableNotificationUseCase);
  }
}
