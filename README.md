# Spring Boot 3x Template (Native) <img height="32" src="https://avatars.githubusercontent.com/u/317776?s=48&v=4" alt="Spring"> <img height="32" src="https://raw.githubusercontent.com/ideahut-apps-team/ideahut-springboot-docs/main/docs/images/logo.png" alt="Ideahut">

- Template implementasi dari Ideahut Springboot 3x Library (Native).
- Dokumen dapat dilihat di [Ideahut Springboot](https://github.com/ideahut-apps-team/ideahut-springboot-docs/)

|     |     |
| ---      | ---       |
| Web Server  | Tomcat  |
| Database  | MySQL  |
| Hibernate  | 6.4.1.Final  |
| Spring  | 6.1.3  |
| Springboot  | 3.2.2  |
| Ideahut  | 3.2.2-0.0.4  |

## Docker
### Centos
```bash
docker build --no-cache -t ideahut-springboot-3x-template-centos . -f Dockerfile-centos
docker run -d --name ideahut-springboot-3x-template-centos -v <lokasi application.yml>:/apps/application.yml -v <lokasi extras>:/apps/extras/ -p 5401:5401 ideahut-springboot-3x-template-centos
```
### Alpine
```bash
docker build --no-cache -t ideahut-springboot-3x-template-alpine . -f Dockerfile-alpine
docker run -d --name ideahut-springboot-3x-template-alpine -v <lokasi application.yml>:/apps/application.yml -v <lokasi extras>:/apps/extras/ -p 5401:5401 ideahut-springboot-3x-template-alpine
```

### Admin
- `URL`  : https://localhost:5401/_
- `User` : admin
- `Pass` : password

