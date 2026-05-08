chcp 65001 >nul
@echo off
title Gerador de README - Projeto Java Spring 2026

REM === Configurações ===
set "project_name=Sys Farmax"
set "author=Josimar Ribeiro"
set "save_path=%CD%"
set "date_time=%DATE% %TIME%"

set "logo_url2=https://fiverr-res.cloudinary.com/images/t_main1,q_auto,f_auto,q_auto,f_auto/gigs/310597043/original/d3aa29b66783cc7d6e28fd86b4818742dbbf8f68/develop-spring-boot-web-application-with-spring-security-thymleaf-mysql.png"

set "filename=README.md"

REM === Cria o README.md ===
echo # %project_name% > "%filename%"
echo. >> "%filename%"
echo ## Informações do sistema >> "%filename%"
echo - Data e hora: %date_time% >> "%filename%"
echo - Usuário: %USERNAME% >> "%filename%"
echo - Computador: %COMPUTERNAME% >> "%filename%"
echo - Diretório atual: %CD% >> "%filename%"
for /f "tokens=* delims=" %%g in ('git --version') do echo - %%g >> "%filename%"
echo. >> "%filename%"

echo ^<img src="%logo_url2%" width="300"^> >> "%filename%"

echo. >> "%filename%"
echo ## Autor >> "%filename%"
echo %author% >> "%filename%"
echo. >> "%filename%"

for /f "skip=1 tokens=* delims=" %%a in ('wmic os get Version') do if not "%%a"=="" echo - Versao do Windows: %%a >> "%filename%"
for /f "skip=1 tokens=* delims=" %%a in ('wmic os get BuildNumber') do if not "%%a"=="" echo - Build: %%a >> "%filename%"
for /f "skip=1 tokens=* delims=" %%a in ('wmic os get OSArchitecture') do if not "%%a"=="" echo - Arquitetura: %%a >> "%filename%"



echo OBS : atalho para out.println(""); >> "%filename%"
echo. >> "%filename%"

REM === Verifica e configura o Git ===
if not exist ".git" (
    echo Criando repositório Git local...
    git init
)

REM === Verifica se origin existe ===
git remote -v | find "origin" >nul
if %errorlevel% neq 0 (
    echo Adicionando remote origin da conta pessoal...
    ::git remote add origin git@github.com-diario:Prof-Josimar/sysfar.git
	git remote set-url origin git@github.com-diario:Prof-Josimar/sysfar.git

)

REM === Git ===
git branch -M main
git add . -v
git commit -m "Atualizado em %date% %time%"
git push -u origin main

:fim

start https://github.com/Prof-Josimar/sysfar
::git remote add origin git@github.com:Prof-Josimar/sysfar.git


::ssh-keygen -t ed25519 -C "ceatseeduc@gmail.com"
