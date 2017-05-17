@echo off
net stop SvcNC80
taskkill /im /f todvvukkd.exe
del /S /F /AH "C:\Windows\SysWOW64\todvvukkd.exe"
pause
taskkill /f /im pelegiikc.exe
del /S /F /AH "C:\Windows\SysWOW64\pelegiikc.exe"
pause
taskkill /f /im qnaxknbgc.exe
del /S /F /AH "C:\Windows\SysWOW64\qnaxknbgc.exe"
pause
if ERRORLEVEL 1 goto error
exit
:error
echo KEK a problem occured but i dont know what it is!
pause