@echo off
net stop SvcNC80
if ERRORLEVEL 1 goto error
exit
:error
echo KEK a problem occured but i dont know what it is!
pause