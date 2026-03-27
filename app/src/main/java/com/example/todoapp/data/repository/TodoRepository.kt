import com.example.todoapp.data.dao.TodoDao
import com.example.todoapp.data.model.Todo

class TodoRepository(private val todoDao: TodoDao) {

    suspend fun insert(todo: Todo) {
        todoDao.insert(todo)
    }

    suspend fun update(todo: Todo) {
        todoDao.update(todo)
    }

    suspend fun delete(todo: Todo) {
        todoDao.delete(todo)
    }

    suspend fun getAllTodos(): List<Todo> {
        return todoDao.getAllTodos()
    }

    suspend fun getTodoById(id: Int): Todo? {
        return todoDao.getTodoById(id)
    }
}