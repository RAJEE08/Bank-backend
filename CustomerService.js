import axios from "axios";

const SHOWCUSTOMER_API_BASE_URL = "http://localhost:8080/showDetails";
const CUSTOMER_API_POST_URL = "http://localhost:8080/saveCustomer";
class CustomerService{

    getCustomers(){
        return axios.get(SHOWCUSTOMER_API_BASE_URL);
    }

    createCustomer(customer){
        return axios.post(CUSTOMER_API_POST_URL, customer);
    }

}

export default CustomerService();