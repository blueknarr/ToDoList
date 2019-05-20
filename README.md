### 자바 8 설치

`sudo apt-get install openjdk-8-jdk`



### tomcat8 설치

`sudo apt-get install tomcat8`



### mariadb 설치

```
sudo apt-get install software-properties-common
sudo apt-key adv --recv-keys --keyserver hkp://keyserver.ubuntu.com:80 0xF1656F24C74CD1D8
sudo add-apt-repository 'deb [arch=amd64,arm64,i386,ppc64el] http://ftp.kaist.ac.kr/mariadb/repo/10.1/ubuntu xenial main'

#mariadb 서버 설치
sudo apt-get -y install mariadb-server

#서비스 재시작
sudo systemctl restart mysql

#방화벽 오픈
sudo ufw allow 3306
```



### AWS 80 포트번호 열기

```
#80포트로 접속하는 웹브라우저의 접속을 8080으로 변경
sudo iptables -t nat -A OUTPUT -o lo -p tcp --dport 80 -j REDIRECT --to-port 8080

#iptables 에 설정내용을 저장 
sudo apt install iptables-persistent
sudo netfilter-persistent save
sudo netfilter-persistent reload
```