from rest_framework import serializers
from .models import NewNews, News

class NewNewsSerializer(serializers.ModelSerializer):
    class Meta:
        model = NewNews
        fields = "__all__"

class NewsSerializer(serializers.ModelSerializer):
    class Meta:
        model = News
        fields = "__all__"