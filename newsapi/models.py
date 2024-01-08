from django.db import models

# Create your models here.
class NewNews(models.Model):
    title = models.CharField(max_length=100)
    content = models.TextField()
    created_at = models.DateTimeField(auto_now_add=True)
    deleted_at = models.DateTimeField(null=True, blank=True)

class News(models.Model):
    title = models.CharField(max_length=100)
    content = models.TextField()
    url_image = models.URLField()
    created_at = models.DateTimeField(auto_now_add=True)
    deleted_at = models.DateTimeField(null=True, blank=True)