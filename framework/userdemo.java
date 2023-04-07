import java.util.List;

import javax.sql.DataSource;

public interface Userdao {
	void save(User user);
    User getById(int id);
    List<User> getAll();
}
public class userdemo 
{
	private User userDao;

    public void Userdemo(User userDao) {
        this.userDao = userDao;
    }

    public void addUser(User user) {
        userdemo.save(user);
    }

	private static void save(User user) {
		// TODO Auto-generated method stub
		
	}
}
public interface User<User> {
    void save(User user);
    User getById(int id);
    List<User> getAll();
}
public class UserDaoImpl implements User {
    private DataSource dataSource;
    
    public UserDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

	@Override
	public void save(Object user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
   