from django.shortcuts import render
from rest_framework.views import APIView
from rest_framework.response import Response
from rest_framework import status
from .models import NewNews, News
from rest_framework.permissions import IsAuthenticated, AllowAny
from .serializers import NewNewsSerializer, NewsSerializer

# Create your views here.
class NewNewsViews(APIView):
    def get(self, request):
        try:
            new_news = NewNews.objects.all()
            serializer = NewNewsSerializer(new_news, many=True)
            return Response({
                'status': 200,
                'message': 'success',
                'data': serializer.data
            }, status=status.HTTP_200_OK)
        except Exception as e:
            return Response({
                'status': 500,
                'message': 'error',
                'data': str(e)
            }, status=status.HTTP_500_INTERNAL_SERVER_ERROR)
        
class NewsViews(APIView):
    def get(self, request):
        try:
            news = News.objects.all()
            serializer = NewsSerializer(news, many=True)
            return Response({
                'status': 200,
                'message': 'success',
                'data': serializer.data
            }, status=status.HTTP_200_OK)
        except Exception as e:
            return Response({
                'status': 500,
                'message': 'error',
                'data': str(e)
            }, status=status.HTTP_500_INTERNAL_SERVER_ERROR)