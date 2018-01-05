import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { FormsModule }   from '@angular/forms';
import { HttpModule }    from '@angular/http';

import { AppComponent } from './app.component';

import { TodoListComponent } from './todo-list.component';

// Inside app.module.ts
import { TodoService } from './todo.service';
import { AppNavbarComponent } from './app-navbar/app-navbar.component';

@NgModule({
  declarations: [
    AppComponent,
    TodoListComponent,
    AppNavbarComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  // Inside app.module.ts
  ////The TodoService will be used to get the data from backend by calling spring boot apis.
providers: [TodoService],
  bootstrap: [AppComponent]
})
export class AppModule { }
