# Django

Django is a python based backend server with adminstrative UI support.

## TL;DR

1. Configuration *- virtual system, create project / app / DB*
2. Create `Post` in admin page *- create class `models.py`, add models to `admin.py`, create / migrate DB*
3. Output page in the `views.py`

## Installing Django

1. Set Windows Environmental PATH - Install Python with Windows installer, check `Add to PATH variable` on start.
2. Install python virtual system named *test* - `python -m venv test`
3. Start the virtual system named *test (which is the Django project name)* - `test\Scripts\activate`
4. Install Django - `pip install django`
5. Create django project named *firstproject* - `django-admin startproject firstproject .`
6. Create app named *firstapp* - `manage.py startapp firstapp`
7. Update the database to the app - `manage.py migrate`
8. Run the server - `manage.py runserver`
9. Modify *firstproject*'s settings - `firstproject\settings.py`
  - Set static file path
    - `STATIC_URL = '/static/'`
    - `STATIC_ROOT = os.path.join(BASE_DIR, 'static')`
10. Create `models.py` *(contains the database object models)*
11. Make app database file - `manage.py makemigrations firstapp`
12. Refresh to the database - `manage.py migrate firstapp`
13. Check working website - `https://localhost:8000/` on the browser

## Create / manage posts

### Create posts
1. Make sure the server is running via `manage.py runserver`
2. Go to `https://localhost:8000/admin` on the browser
3. Log in with created credenticals
4. Click on the database object *(which is in `models.py`)*
5. Enter details and create

### Manage posts
1. Make sure the server is running via `manage.py runserver`
2. Go to `https://localhost:8000/admin` on the browser
3. Log in with created credenticals
4. Click on the database object *(which is in `models.py`)*
5. Manage created objects

### Create posts (by shell)
1. Access the Django shell - `manage.py shell`
2. Import the `Post` objects in `models.py` - `from firstapp.models import Post`
3. Create new post with credentical *me (this should be defined as a variables as a object `User`)*, title as *testTitle*, text as *testText* - `Post.objects.create(author=me, title='testTitle', text='testText')`
4. List posts to check - `Post.objects.all()`

### Manage posts (by shell)
// todo
사용자 확인
from django.contrib.auth.models import User
User.objects.all()

### Search posts (by shell filters)
// todo
16_3 객체 조회하기(조건)
특정사용자:Post.objects.filter(author=me)
글자검색:Post.objects.filter(title__contains='te')

시간검색
16_3_1 from django.utils import timezone
16_3_2 Post.objects.filter(created_date=timezone.now())
16_3_2(1) Post.objects.filter(published_date=timezone.now())
16_3_3 post=Post.objects.get(title='test2')
16_3_4 post.publish()
16_3_5 post=Post.objects.filter(published_date__lte=timezone.now())

## Create / manage superusers

### Create superusers
1. Create Django superuser - `manage.py createsuperuser`
2. Check admin page - `https://localhost:8000/admin` on the browser
3. Log in with created credenticals

### Manage superusers
1. Access the django shell - `manage.py shell`
2. Import User object from Django - `from django.contrib.auth.models import User`
3. List superusers in Django - `User.objects.filter(is_superuser=True)`
4. Get user from username - `usr = User.objects.get(username='your username')`
5. Set password from the defined user - `usr.set_password('raw password')`
6. Save changes - `usr.save()`
