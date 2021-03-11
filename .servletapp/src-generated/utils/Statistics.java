package utils;
import webdsl.generated.templates.*;public class Statistics{
public static void logStatistics(){
java.util.List<PageStats> results=new java.util.ArrayList<PageStats>();
results.add(new PageStats().setPage("signIn").setReadOnly(SignInPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(SignInPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(SignInPage.renderWithUpdates.getAndSet(0)).setActionFailed(SignInPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(SignInPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(SignInPage.actionSuccessWithUpdates.getAndSet(0)));
results.add(new PageStats().setPage("root").setReadOnly(RootPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(RootPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(RootPage.renderWithUpdates.getAndSet(0)).setActionFailed(RootPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(RootPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(RootPage.actionSuccessWithUpdates.getAndSet(0)));
results.add(new PageStats().setPage("register").setReadOnly(RegisterPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(RegisterPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(RegisterPage.renderWithUpdates.getAndSet(0)).setActionFailed(RegisterPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(RegisterPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(RegisterPage.actionSuccessWithUpdates.getAndSet(0)));
results.add(new PageStats().setPage("profile").setReadOnly(ProfilePage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(ProfilePage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(ProfilePage.renderWithUpdates.getAndSet(0)).setActionFailed(ProfilePage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(ProfilePage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(ProfilePage.actionSuccessWithUpdates.getAndSet(0)));
results.add(new PageStats().setPage("pagenotfound").setReadOnly(PagenotfoundPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(PagenotfoundPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(PagenotfoundPage.renderWithUpdates.getAndSet(0)).setActionFailed(PagenotfoundPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(PagenotfoundPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(PagenotfoundPage.actionSuccessWithUpdates.getAndSet(0)));
results.add(new PageStats().setPage("accessDenied").setReadOnly(AccessDeniedPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(AccessDeniedPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(AccessDeniedPage.renderWithUpdates.getAndSet(0)).setActionFailed(AccessDeniedPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(AccessDeniedPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(AccessDeniedPage.actionSuccessWithUpdates.getAndSet(0)));
results.add(new PageStats().setPage("noMessages").setReadOnly(NoMessagesPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(NoMessagesPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(NoMessagesPage.renderWithUpdates.getAndSet(0)).setActionFailed(NoMessagesPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(NoMessagesPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(NoMessagesPage.actionSuccessWithUpdates.getAndSet(0)));
results.add(new PageStats().setPage("showMessagesLStringL").setReadOnly(ShowMessagesLStringLPage.renderReadOnly.getAndSet(0)).setReadOnlyFromCache(ShowMessagesLStringLPage.renderReadOnlyFromCache.getAndSet(0)).setWithUpdates(ShowMessagesLStringLPage.renderWithUpdates.getAndSet(0)).setActionFailed(ShowMessagesLStringLPage.actionFailed.getAndSet(0)).setActionSuccessReadOnly(ShowMessagesLStringLPage.actionSuccessReadOnly.getAndSet(0)).setActionSuccessWithUpdates(ShowMessagesLStringLPage.actionSuccessWithUpdates.getAndSet(0)));
utils.PageStats.printList(results);
}
}