Para despliegue de los subproyectos:

---------Backend:

Abrir una ventana de terminal y ejecutar los siguientes comandos:

1) wget -O- https://apt.corretto.aws/corretto.key | sudo apt-key add - 

2) sudo add-apt-repository 'deb https://apt.corretto.aws stable main'

3) sudo apt-get update; sudo apt-get install -y java-11-amazon-corretto-jdk

4) sudo groupadd -r wildfly

5) sudo useradd -r -g wildfly -d /opt/wildfly -s /sbin/nologin wildfly

6) Version_Number=20.0.1.Final

7) wget https://download.jboss.org/wildfly/$Version_Number/wildfly-$Version_Number.tar.gz -P /tmp

8) sudo tar xf /tmp/wildfly-$Version_Number.tar.gz -C /opt/

9) sudo ln -s /opt/wildfly-$Version_Number /opt/wildfly

10) sudo chown -RH wildfly: /opt/wildfly

11) sudo mkdir -p /etc/wildfly

12) sudo cp /opt/wildfly/docs/contrib/scripts/systemd/wildfly.conf /etc/wildfly/

13) sudo cp /opt/wildfly/docs/contrib/scripts/systemd/launch.sh /opt/wildfly/bin/

14) sudo sh -c 'chmod +x /opt/wildfly/bin/*.sh'

15) sudo cp /opt/wildfly/docs/contrib/scripts/systemd/wildfly.service /etc/systemd/system/

16) sudo systemctl daemon-reload

17) sudo systemctl start wildfly

18) sudo apt install maven

19) sudo apt install git

20) git clone https://github.com/teixbr/tribalmnctest.git

21) cd tribalmnctest/backend/src

22) mvn clean install 

23) sudo /opt/wildfly/bin/add-user.sh

24) a

25) admin

26) a

27) admin

28) y

29) presionar enter

30) n

31) cd /opt/wildfly/bin/

32) ./jboss-cli.sh --connect --command="deploy --force /home/ubuntu/tribalmnctest/backend/src/Services/Implementation/target/mncBackEnd.war"

33) admin

34) admin

Aqui ya tendremos desplegado y funcional el back end. Accessible en la dirección: localhost:8080


----------FrontEnd

Abrir una ventana de terminal y ejecutar los siguientes comandos

1) sudo apt-get install -y nginx

2) sudo apt-get -s clean 

3) cd /etc/nginx/sites-available

4) sudo nano tribal.com

5) pegar el siguiente texto (sin incluir comillas): 

"server {
listen 3200;
listen [::]:3200;
root /var/www/tribal/dist/tribalfrontend;
server_tokens off;
index index.html index.htm;
location / {
# First attempt to server request as file, then
# as directory, then fall back to displaying a 404.
try_files $uri $uri/ /index.html =404;
}
}"

6) teclear control + x

7) y

8) enter

9) cd /etc/nginx/sites-enabled

10) sudo ln -s ../sites-available/tribal.com

11) sudo rm default

12) sudo nginx -s reload

13) cd /home/ubuntu/tribalmnctest/frontend

14) sudo curl -sL https://deb.nodesource.com/setup_14.x | sudo -E bash -

15) sudo apt-get install -y nodejs

16) apt-get install -y build-essential

17) sudo npm install -g @angular/cli

18) sudo npm install 

19) ng build --prod

20) cd /var/www

21) sudo mkdir tribal

22) sudo cp /home/ubuntu/tribalmnctest/frontend/dist /var/www/tribal -r

23) sudo nginx -s reload

