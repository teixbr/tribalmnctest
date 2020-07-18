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

14) sudo cp /opt/wildfly/docs/contrib/scripts/systemd/launch.sh /opt/wildfly/bin/

15) sudo sh -c 'chmod +x /opt/wildfly/bin/*.sh'

16) sudo cp /opt/wildfly/docs/contrib/scripts/systemd/wildfly.service /etc/systemd/system/

17) sudo systemctl daemon-reload

18) sudo systemctl start wildfly

19) sudo apt install maven

20) sudo apt install git

21) git clone https://github.com/teixbr/tribalmnctest.git

22) cd tribalmnctest/backend/src

23) mvn clean install 

24) sudo /opt/wildfly/bin/add-user.sh

25) a

26) admin

27) a

28) admin

29) y

30) presionar enter

31) n

24) cd /opt/wildfly/bin/

24) ./jboss-cli.sh --connect --command="deploy --force /home/ubuntu/tribalmnctest/backend/src/Services/Implementation/target/mncBackEnd.war"