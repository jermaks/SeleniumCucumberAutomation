Rest Sandbox:
https://rbeqres.in/

Rest Client:
- REST Assured

Todo:
1. Implement REST Assured Rest tests.
2. Add POST requests and related test(s).
3. Try to use chain of responsibility pattern.
4. Implement auto build in Jenkins when Push on Git.
5. Implement Test Analytics (Allure?).
6.

Done:
1. Implement Logger(SLF4J) to be able to see in Console and Jenkins Console Output:
   a. rest request and responses;
   b. test steps (e.g. LOGGER.info("STEP 1: Get User List"));
2. Add @BeforeClass for preconditions.
3. Implement TestNg (JUnit temporary commented out due to conflict with TestNg).
4. Added AssertJ and soft assertion usage.
5. Implement REST Assured Rest tests.
6. Jenkins: added branch choice.
7. JSON-Server with employers.
8. Rest-Assured with model GET and POST.


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

