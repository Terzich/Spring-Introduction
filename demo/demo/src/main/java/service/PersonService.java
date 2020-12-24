package service;

import dao.PersonDao;
import model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private  final PersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao){
        this.personDao=personDao;
    }


    public int InsertPerson(Person person){
       return personDao.insertPerson(person);
    }

    public List<Person> getAllPersons(){
        return personDao.selectAllPersons();
    }
}
