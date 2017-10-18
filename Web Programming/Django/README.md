# Django

Django is a python based backend server with adminstrative UI support.

## TL;DR

1. Configuration *- virtual system, create project / app / DB*
2. Create `Post` in admin page *- create class `models.py`, add models to `admin.py`, create / migrate DB*
3. Output page in the `views.py` *- send to templates HTML page, show database*

## 1. Configuration
0. Install Python with Windows installer, check `Add to PATH variable` on start.
1. `python -m venv project`
2. `project\Scripts\activate`
3. `pip install django`

### 1.2 Make project
1. `django-admin startproject mysite .` *(dot at the end is needed)*
2. Modify settings.py
    ```python
    # set timezone
    TIME_ZONE = 'Asia/Seoul’
    # set static file location
    STATIC_URL = '/static/'
    STATIC_ROOT = os.path.join(BASE_DIR, 'static')
    # configure database
    DATABASES = {
      'default': {
        'ENGINE': 'django.db.backends.sqlite3',
        'NAME': os.path.join(BASE_DIR, 'db.sqlite3'),
      }
    }
    ```
3. `python manage.py runserver 0:8000`

### 1.1 Make apps
1. `python manage.py startapp blog`
2. Modify `mysite/settings.py`
    ```python
    INSTALLED_APPS = (
      ...
      'blog',
    )
    ```

## 2. Create model
1. Create `blog/models.py`
    ```python
    from django.db import models
    from django.utils import timezone
    
    class Post(models.Model):
      author = models.ForeignKey('auth.User')
      title = models.CharField(max_length=200)
      text = models.TextField()
      created_date = models.DateTimeField(default=timezone.now)
      published_date = models.DateTimeField(blank=True, null=True)
      
      def publish(self):
        self.published_date = timezone.now()
        self.save()
        
      def __str__(self):
        return self.title
    ```
    
    `models.CharField` - Limited length text
    
    `models.TextField` - Unlimited length text
    
    `models.DateTimeField` - Date and time
    
    `models.ForeignKey` - Links to other models
    
2. `python manage.py makemigrations blog` *(Add model db file)*
3. `python manage.py migrate blog` *(Apply models to db)*

### 2.1 Check model in admin page
1. `http://localhost:8000/admin`

### 2.2 Create admin user
1. `python manage.py createsuperuser`

### 2.3 Register new model to admin
1. Modify `blog/admin.py`
    ```python
    from django.contrib import admin
    from .models import Post
    
    admin.site.register(Post)
    ```

## 3. Output page
1. Modify `mysite/urls.py`
    ```python
    from django.conf.urls import include, url
    from django.contrib import admin
    
    urlpatterns = [
      # redirects all requests from admin/ to admin.site.urls
      url(r'^admin/', include(admin.site.urls)),
      # redirects all requests from / to blog.urls
      url(r'', include('blog.urls')), # include() is from django.conf.urls
    ]
    ```
    
    Regex examples
    
    `^value/` - String should start with "value/"
    
    `(value)` - Save the value "value"
    
    `\d+` - Should be 1 or more digit of number
    
    `value$` - String should end with "value"
    
2. Add `blog/url.py`
    ```python
    from django.conf.urls import url
    from . import views
    
    urlpatterns = [
      # views is from same directory
      url(r'^$', views.post_list, name='post_list'),
    ]
    ```
3. Add `blog/view.py`
    ```python
    from django.shortcuts import render
    from .models import Post
    
    def post_list(request):
      # render all objects to templates/blog/post_list.html
      return render(request, 'blog/post_list.html', {'posts': Post.objects.all()})
    ```
    
  3.1 QuerySet examples
  
   `python manage.py shell` use interactive console for db
      
   3.1.1 Show all
   
   ```python
   >>> from blog.models import Post
   >>> Post.objects.all()
   [<Post: mysite/settint.py>, <Post: models.py>, <Post: admin.py>]
   ```
       
       this returns all db objects from model Post in `blog.models`
   3.1.2 Create object
   
   ```python
   >>> from django.contrib.auth.models import User
   >>> User.objects.all()
   [<User: admin>]
   >>> me = User.objects.get(username='admin')
   >>> Post.objects.create(author=me, title='sample test',text='sample testing')
   <Post: sample test>
   >>> Post.objects.all()
   [<Post: mysite/settint.py>, <Post: models.py>, <Post: admin.py>, <Post: sample test>]
   ```
       
   3.1.3 Filter data
   
   ```python
   >>> Post.objects.filter(author=me)
   [<Post: mysite/settint.py>, <Post: models.py>, <Post: admin.py>, <Post: sample test>]
   ```
   
   can use it like `filter(title__contains='as')`, `filter(text__contains='te')`
   
   ```python
   from django.utils import timezone
   filter(published_date__lte=timezone.now
   ```
   
   ```python
   # publish created object in console
   >>> post = Post.objects.get(title="sample title")
   >>> post.publish()
   ```
       
   3.1.4 Sort data
   
   ```python
   >>> Post.objects.order_by('created_date')
   # Latest created is on left
   [<Post: mysite/settint.py>, <Post: models.py>, <Post: admin.py>, <Post: sample test>]
   ```
   
   ```python
   >>> Post.objects.order_by('-created_date')
   # Oldest created is on left
   [<Post: sample test>, <Post: admin.py>, <Post: models.py>, <Post: mysite/settint.py>]
   ```
  3.2 Connect querysets
  
   `>>> Post.objects.filter(published_date__lte=timezone.now()).order_by('published_date')`
      
  3.3 Exit
   `exit()`
      
4. Add `blog/views.py`

   ```python
   from django.shortcuts import render
   from django.utils import timezone #timezone.now() 함수로 인해 호출
   from .models import Post
   
   def post_list(request):
     posts = Post.objects.filter(published_date__lte=timezone.now()).order_by('published_date') # order by latest
     return render(request, 'blog/post_list.html', {'posts': posts}) # render to HTML
   ```
 4.1 Django template tag
   Add `blog/post_list.html`
   
   ```html
   <!doctype html>
   <html>
   <head>
     <meta charset="utf-8">
   </head>
   <body>
     <div>
       <h1><a href="/">hello sunrin</a></h1>
     </div>
     {{ posts }}
   </body>
   </html>
   ```
   
   Advanced tags
   ```html
   <div>
     <h1><a href="/">hello sunrin</a></h1>
   </div>
   {% for post in posts %}
    <div>
      <p>published: {{ post.published_date }}</p>
      <h1><a href="">{{ post.title }}</a></h1>
      <p>{{ post.text|linebreaksbr }}</p>
      <!--|linebreaksbr - means break paragraph on line break on text-->
    </div>
   {% endfor %}
   ```

### Django MTV Model
![MTV model](https://pythonhosted.org/MyTARDIS/_images/DjangoArchitecture-JeffCroft.png)

### Create / manage posts

#### Create posts
1. Make sure the server is running via `manage.py runserver`
2. Go to `https://localhost:8000/admin` on the browser
3. Log in with created credenticals
4. Click on the database object *(which is in `models.py`)*
5. Enter details and create

#### Manage posts
1. Make sure the server is running via `manage.py runserver`
2. Go to `https://localhost:8000/admin` on the browser
3. Log in with created credenticals
4. Click on the database object *(which is in `models.py`)*
5. Manage created objects

### Create / manage superusers

#### Create superusers
1. Create Django superuser - `manage.py createsuperuser`
2. Check admin page - `https://localhost:8000/admin` on the browser
3. Log in with created credenticals

#### Manage superusers
1. Access the django shell - `manage.py shell`
2. Import User object from Django - `from django.contrib.auth.models import User`
3. List superusers in Django - `User.objects.filter(is_superuser=True)`
4. Get user from username - `usr = User.objects.get(username='your username')`
5. Set password from the defined user - `usr.set_password('raw password')`
6. Save changes - `usr.save()`
