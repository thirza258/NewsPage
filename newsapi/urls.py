from django.urls import path
from .views import NewNewsViews, NewsViews

urlpatterns = [
    path("new/", NewNewsViews.as_view(), name="new_news"),
    path("news/", NewsViews.as_view(), name="news"),
]