# spring-boot-projects-tests

Projects for testing SpringBoot + (Thymeleaf || Angular || React)

## Project-01 - `./student-management-system/`

Project for testing SpringBoot 2.4 with Thymeleaf (basic)
 - Maven
 - SpringBoot 2.4
 - Thymeleaf

## Project-02 - `./sb-backend-angular/` and `./sb-frontend-angular`

Project for testing SpringBoot with Angular
 - Maven
 - SpringBoot 2.4
 - Angular 12
 - Bootstrap 4

#### `./sb-frontend-angular`
Used VSCode to run and test

##### To build

Inside of project folder
 - `ng build`
 - `cp ./dist/sb-frontend-angular/*  ../sb-backend-angular/src/main/resources/public/.`

*IMPORTANT*: SpringBoot 2.4 need to have `\public` folder inside of `\content`, when you get the `\` ( `htttp://{url}/` ) to serve the `index.html` file (and others)

#### `./sb-frontend-angular`
Used eclipse to tun and test
