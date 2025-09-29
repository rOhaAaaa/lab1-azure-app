# Lab 1 — Azure App Service + PostgreSQL + Swagger

[![CI/CD](https://github.com/rOhaAaaa/lab1-azure-app/actions/workflows/azure-webapp.yml/badge.svg)](https://github.com/rOhaAaaa/lab1-azure-app/actions/workflows/azure-webapp.yml)

Демо:
- **Home:** https://lab-web-app-rostik-ezdccuh2g6g4hzc8.northeurope-01.azurewebsites.net/
- **API:** https://lab-web-app-rostik-ezdccuh2g6g4hzc8.northeurope-01.azurewebsites.net/api/users
- **Swagger:** https://lab-web-app-rostik-ezdccuh2g6g4hzc8.northeurope-01.azurewebsites.net/swagger-ui/index.html

## Технології
- Spring Boot (Java 17), Maven  
- Azure App Service (Windows, Java SE)  
- PostgreSQL  
- Swagger (springdoc-openapi-ui)  
- GitHub Actions (CI/CD → деплой на push у `main`)

## Локальний запуск
```bash
# Windows PowerShell
$env:SPRING_DATASOURCE_URL="jdbc:postgresql://<host>:5432/<db>?sslmode=require"
$env:SPRING_DATASOURCE_USERNAME="<user>"
$env:SPRING_DATASOURCE_PASSWORD="<pass>"
$env:SPRING_JPA_HIBERNATE_DDL_AUTO="update"
./mvnw spring-boot:run
