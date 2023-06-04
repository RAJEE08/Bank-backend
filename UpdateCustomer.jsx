import React, { Component } from 'react';
import { Link } from 'react-router-dom';
import CustomerService from '../services/CustomerService';

class UpdateCustomer extends Component {
    constructor(props){
        super(props)

        this.state = {
            customer_name: '',
            account_no: '',
            account_type: '',
            phone_no: '',
            account_balance: '',
            username: '',
            password: ''
        }
        this.changeCustomerNameHandler = this.changeCustomerNameHandler.bind(this);
        this.changeAccountNoHandler = this.changeAccountNoHandler.bind(this);
        this.changeAccountTypeHandler = this.changeAccountTypeHandler.bind(this);
        this.changePhoneNoHandler = this.changePhoneNoHandler.bind(this);
        this.changeAccountBalanceHandler = this.changeAccountBalanceHandler.bind(this);
        this.changeUserNameHandler = this.changeUserNameHandler.bind(this);
        this.changePasswordHandler = this.changePasswordHandler.bind(this);
        this.updateCustomer = this.updateCustomer.bind(this);
    }

    updateCustomer = (e) => {
        e.preventDefault();
        let customer = {customer_name: this.state.customer_name, account_no: this.state.account_no, account_type: this.state.account_type, phone_no: this.state.phone_no, account_balance: this.state.account_balance, username: this.state.username, password: this.state.password};
        console.log('customer => ' + JSON.stringify(customer));

        CustomerService.updateCustomer(customer);
    }

    changeCustomerNameHandler= (event) => {
        this.setState({customer_name: event.target.value});
    }

    changeAccountNoHandler= (event) => {
        this.setState({account_no: event.target.value});
    }

    changeAccountTypeHandler= (event) => {
        this.setState({account_type: event.target.value});
    }

    changePhoneNoHandler= (event) => {
        this.setState({phone_no: event.target.value});
    }

    changeAccountBalanceHandler= (event) => {
        this.setState({account_balance: event.target.value});
    }

    changeUserNameHandler= (event) => {
        this.setState({username: event.target.value});
    }

    changePasswordHandler= (event) => {
        this.setState({password: event.target.value});
    }

    render() {
        return (
            <div>
                <div className="container">
                    <div className="row">
                        <div className="card col-md-6 offset-md-3 offset-md">
                            <h3 className="text-center">Add Customer</h3>
                            <div className="card-body">

                                <form>
                                    <div className="form-group">
                                        <label>Customer Name</label>
                                        <input placeholder="Customer Name" name="customer_name" className="form-control"
                                        value={this.state.customer_name} onChange={this.changeCustomerNameHandler}/>
                                    </div>
                                    <div className="form-group">
                                        <label>Account No</label>
                                        <input placeholder="Account No" name="account_no" className="form-control"
                                        value={this.state.account_no} onChange={this.changeAccountNoHandler}/>
                                    </div>
                                    <div className="form-group">
                                        <label>Account Type</label>
                                        <input placeholder="Account Type" name="account__type" className="form-control"
                                        value={this.state.account_type} onChange={this.changeAccountTypeHandler}/>
                                    </div>
                                    <div className="form-group">
                                        <label>Phone No</label>
                                        <input placeholder="Phone No" name="phone_no" className="form-control"
                                        value={this.state.phone_no} onChange={this.changePhoneNoHandler}/>
                                    </div>
                                    <div className="form-group">
                                        <label>Account Balance</label>
                                        <input placeholder="Account Balance" name="account_balance" className="form-control"
                                        value={this.state.account_balance} onChange={this.changeAccountBalanceHandler}/>
                                    </div>
                                    <div className="form-group">
                                        <label>UserName</label>
                                        <input placeholder="UserName" name="username" className="form-control"
                                        value={this.state.username} onChange={this.changeUserNameHandler}/>
                                    </div>
                                    <div className="form-group">
                                        <label>Password</label>
                                        <input placeholder="Password" name="password" className="form-control"
                                        value={this.state.password} onChange={this.changePasswordHandler}/>
                                    </div>

                                    <Link to="/ListCustomer"><button className="btn btn-success" onClick={this.updateCustomer}>Update</button></Link>
                                    <Link to="/ListCustomer"><button className="btn btn-danger" style={{marginLeft: "10px"}}>Cancel</button></Link>
                                </form>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default UpdateCustomer;
