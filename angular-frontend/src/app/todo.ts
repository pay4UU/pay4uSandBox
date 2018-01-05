//Before defining the TodoListComponent, let’s define a Todo class for working with Todos. 
//create a new file todo.ts inside src/app folder and add the following code to it -


export class Todo {
  id: string;
  title: string;
  description: string;
  completed: boolean;
  createdAt: Date;
}