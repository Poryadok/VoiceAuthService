# Первый этап: сборка
FROM openjdk:21-jdk-slim AS builder

# Установите рабочую директорию
WORKDIR /app

# Копируйте файлы сборки
COPY . .

# Выполните сборку приложения
RUN ./gradlew build --no-daemon

RUN ls -l /app/build/
RUN ls -l /app/build/libs/

# Второй этап: создание минимального образа
FROM openjdk:21-slim

# Установите рабочую директорию для приложения
WORKDIR /app

# Копируйте только собранный JAR файл из стадии сборки
COPY --from=builder /app/build/libs/VoiceAuthService-1.0.0.jar app.jar

# Укажите команду для запуска вашего приложения
CMD ["java", "-jar", "app.jar"]