import React, {Component} from 'react';

export class House extends Component {

    constructor(props) {
        super(props);
        this.state = {};
    }

    houseFilter(house) {
        return (student) => student.house === house;
    }

    renderStudent(student) {
        return <li key={student.id}>{student.name}</li>;
    }

    render() {
        const students = this.props.students
            .filter(this.houseFilter(this.props.name));
        return <div>
            <h2>{this.props.name} ({students.length})</h2>
            <ul>
                {
                    students.map(this.renderStudent.bind(this))
                }
            </ul>
        </div>;
    }

}
