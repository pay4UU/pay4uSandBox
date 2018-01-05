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

nezabudni skontrolovat ci nejake nemas






