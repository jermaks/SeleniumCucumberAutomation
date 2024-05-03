Rest Client:
fasterxml jackson


---------------------------------------------------------------
sudo apt-get update

sudo apt-get upgrade

sudo apt-get install -y libappindivator1 fonts-liberation

wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb

sudo dpkg -i google-chrome*.deb

sudo apt-get install -f

wget -O chromedriver_linux64.zip https://chromedriver.storage.googleapis.com/LATEST_RELEASE

VERSION=$(cat LATEST_RELEASE)
wget "https://chromedriver.storage.googleapis.com/$VERSION/chromedriver_linux64.zip"

curl -o chromedriver_linux64.zip https://chromedriver.storage.googleapis.com/$VERSION/chromedriver_linux64.zip

sudo apt install unzip

sudo mv chromedriver /usr/bin/chromedriver

sudo apt-get install default-jdk

sudo apt install maven

sudo apt install git

 sudo wget -O /usr/share/keyrings/jenkins-keyring.asc \
    https://pkg.jenkins.io/debian-stable/jenkins.io-2023.key

 echo deb [signed-by=/usr/share/keyrings/jenkins-keyring.asc] \
    https://pkg.jenkins.io/debian-stable binary/ | sudo tee \
    /etc/apt/sources.list.d/jenkins.list > /dev/null

sudo apt-get update

sudo apt-get install fontconfig openjdk-17-jre

sudo apt-get install jenkins

