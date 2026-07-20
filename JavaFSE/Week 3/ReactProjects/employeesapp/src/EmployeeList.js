import React from 'react';
import EmployeeCard from './EmployeeCard';

function EmployeeList(props) {
    return (
        <div style={{ display: 'flex', gap: '15px' }}>
            {props.employees.map((emp) => (
                <EmployeeCard key={emp.id} employee={emp} />
            ))}
        </div>
    );
}

export default EmployeeList;