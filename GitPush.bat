@echo off
echo =========================================
echo 		Subiendo cambios
echo =========================================

git add .
git commit -m "%date% %time%"
git push

echo =========================================
echo 		Proceso completado.
echo =========================================
pause