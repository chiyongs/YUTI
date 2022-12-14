cd frontend

echo "========== [FrontEnd] npm installing... =========="
npm i -f

echo "========== [FrontEnd] Build Process... =========="
npm run build

cd ../backend/main-server

echo "========== [BackEnd][Main-Server] Build Process... =========="
./gradlew clean build

cd ../analytics

echo "========== [BackEnd][Analytics] Build Process... =========="
./gradlew clean build

cd ../logging

echo "========== [BackEnd][Log Producer] Build Process... =========="
./gradlew clean build

cd ..
cd ..

echo "========== [Docker] Docker Compose Up =========="
docker-compose up --build -d