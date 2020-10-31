package guru.springfamework.services;

import guru.springfamework.api.v1.mapper.CustomerMapper;
import guru.springfamework.domain.Customer;
import guru.springfamework.repositories.CustomerRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CustomerServiceTest {

    public static final String NIKEN = "Niken";

    @Mock
    private CustomerRepository customerRepository;

    CustomerService customerService;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        customerService = new CustomerServiceImpl(CustomerMapper.INSTANCE, customerRepository);
    }

    @Test
    public void getCustomerByFirstName() {
        //given
        Customer customer1 = mock(Customer.class);
        when(customer1.getFirstName()).thenReturn(NIKEN);

        //when
        when(customerRepository.findCustomerByFirstName(NIKEN)).thenReturn(customer1);

        assertEquals(NIKEN,customerService.getCustomerByFirstName(NIKEN).getFirstName());
    }

    @Test
    public void getAllCustomers() {

        Customer customer1 = mock(Customer.class);
        Customer customer2 = mock(Customer.class);
        Customer customer3 = mock(Customer.class);
        List<Customer> customerList = Arrays.asList(customer1,customer2,customer3);

        when(customerRepository.findAll()).thenReturn(customerList);

        assertEquals(3,customerService.getAllCustomers().size());
    }

    @Test
    public void getCustomerById() {

        Customer customer1 = mock(Customer.class);
        when(customer1.getId()).thenReturn(1L);

        when(customerRepository.findById(1L)).thenReturn(java.util.Optional.of(customer1));
        assertEquals(Long.valueOf(1L), customerService.getCustomerById(1L).getId());
    }
}