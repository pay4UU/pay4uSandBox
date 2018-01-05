# pay4uSandBox
sandbox of Tomas and Samo

$ ./gradlew bootRun
Error: Could not find or load main class org.gradle.wrapper.GradleWrapperMain
https://stackoverflow.com/questions/29805622/could-not-find-or-load-main-class-org-gradle-wrapper-gradlewrappermain

gradlew is the gradle wrapper executable - batch script on windows and shell script elsewhere. If you include the following lines in your build.gradle,

task wrapper(type: Wrapper) {
    gradleVersion = '2.0'
}
a gradle wrapper script is added to your source folders.

Missed gradle-wrapper.jar under directory gradle/wrapper in your project.

You need to generate this file via this script in build.gradle file as below,

task wrapper(type: Wrapper) {
   gradleVersion = '2.0' // version required
}
and run task:

gradle wrapper

Ide to OK, pomocou $ ./gradlew bootRun sa da spustit BE
BE sa da otestovat takto:
$ curl http://localhost:8080/api/todos|jq


FE:
**$ ng serve --open
node_modules appears empty, you may need to run `npm install`

works

*pridaj ssh kluce podla navodu
https://help.github.com/articles/adding-a-new-ssh-key-to-your-github-account/

nezabudni skontrolovat ci nejake SSH nemas

npriek tomu to chce odo mna stale konto a heslo, ale ekd som dal:
$git remote set-url origin git@gist.github.com:pay4UU/pay4uSandBox.git

pomohlo

a teraz problemy s menu:
https://codingthesmartway.com/angular-material-part-3-navigation-menus-sidenavs-and-toolbars/

https://github.com/angular/material2/issues/7692

neskor skusim este raz

ale teraz navbar podla 
https://medium.com/codingthesmartway-com-blog/building-an-angular-5-project-with-bootstrap-4-and-firebase-4504ff7717c1

/pay4uSandBox/angular-frontend/src/app/app-navbar
/pay4uSandBox/angular-frontend/src/app/app-navbar/app-navbar.component.css
/pay4uSandBox/angular-frontend/src/app/app-navbar/app-navbar.component.html
/pay4uSandBox/angular-frontend/src/app/app-navbar/app-navbar.component.spec.ts
/pay4uSandBox/angular-frontend/src/app/app-navbar/app-navbar.component.ts

Asi by bolo treba zmenit CCS tak aby boli volby v riadku









