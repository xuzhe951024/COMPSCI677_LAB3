 docker pull alpine/socat
 docker run \
     --publish 2376:2375 \
     --link example-container:target \
     alpine/socat \
     tcp-listen:2375,fork,reuseaddr tcp-connect:target:2375

 java -cp app.jar -Dloader.main=com.zhexu.cs677_lab3.utils.ProfilesGenerator org.springframework.boot.loader.PropertiesLauncher config.yml
 echo ./cs677.lab*.peer*.com | xargs -n 1 cp app.jar
 echo ./cs677.lab*.peer*.com | xargs -n 1 cp wait-for.sh
 docker-compose up -d