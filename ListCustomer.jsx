import React, { Component } from 'react';
import { Link } from "react-router-dom";
import CustomerService from '../services/CustomerService';

class ListCustomer extends Component {
    constructor(props) {
        super(props)

        this.state = {
            customers: []
        }
        
    }

    componentDidMount(){
        CustomerService.getCustomers().then((res) =>{
            this.setState({customers:res.data})
        });
    }

    render() {
        return (
            <div>
                <h2 className="text-center">Customer List</h2>
                <div className="row">
                    <Link to="/CreateCustomer"><button className="btn btn-primary">Add Customer</button></Link>
                </div>
                <div className="row">
                    <table className="table table-stripped table-bordered">

                        <thead>
                            <tr>
                                <th>Customer Id</th>
                                <th>Customer Name</th>
                                <th>Account No</th>
                                <th>Account Type</th>
                                <th>Phone No</th>
                                <th>Account Balance</th>
                                <th>Action</th>
                            </tr>

                        </thead>

                        <tbody>
                            {
                                this.state.customers.map(
                                    customer =>
                                    <tr key ={customer.customer_id}>
                                        <td>{customer.customer_id}</td>
                                        <td>{customer.customer_name}</td>
                                        <td>{customer.account_no}</td>
                                        <td>{customer.account_type}</td>
                                        <td>{customer.phone_no}</td>
                                        <td>{customer.account_balance}</td>
                                        <td>
                                            <button className="btn btn-info">Update</button>
                                        </td>
                                    </tr>
                                )
                            }

                        </tbody>
                    </table>
                </div>

            </div>
        )
    }
}

export default ListCustomer;
