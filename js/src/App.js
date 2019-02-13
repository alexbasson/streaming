import React, {Component} from 'react';
import {House} from './House';
import './App.css';
import {SortingHatService} from "./SortingHatService";

class App extends Component {

    sortingHatService = new SortingHatService();

    constructor(props) {
        super(props);
        this.state = {
            students: [],
            sorting: false,
            done: false
        };
    }

    streamStudents() {
        this.setState({
            sorting: true
        });
        this.sortingHatService.streamAll().subscribe(
            this.observeStudent.bind(this),
            () => {
            },
            () => {
                this.setState({
                    done: true
                });
            }
        );
    }

    fetchStudents() {
        this.setState({
            sorting: true
        });
        this.sortingHatService.fetchAll().subscribe(
            (students) => {
                this.setState({
                    students: students
                });
            },
            () => {
            },
            () => {
                this.setState({
                    done: true
                });
            }
        )
    }

    clear() {
        this.setState({
            students: [],
            sorting: false,
            done: false
        });
    }

    observeStudent(student) {
        const students = this.state.students;
        students.push(student);
        this.setState({
            students: students
        });
    }

    render() {
        return <div>
            <h1>Sorting Hat ({this.state.students.length})</h1>

            <div className="flex space-around">
                <button
                    className="btn btn-primary"
                    onClick={this.streamStudents.bind(this)}
                >Stream students
                </button>

                <button
                    className="btn btn-primary"
                    onClick={this.fetchStudents.bind(this)}
                >Fetch students
                </button>

                <button
                    className="btn btn-secondary"
                    onClick={this.clear.bind(this)}
                >Clear
                </button>
            </div>

            <div>
                <h3>
                    {this.state.sorting ? 'Sorting... ' : ''}
                    {this.state.done ? 'Done!' : ''}
                </h3>
            </div>

            <div className="grid">
                <House
                    className="col1"
                    name="GRYFFINDOR"
                    students={this.state.students}
                />
                <House
                    className="col2"
                    name="SLYTHERIN"
                    students={this.state.students}
                />
                <House
                    className="col3"
                    name="RAVENCLAW"
                    students={this.state.students}
                />
                <House
                    className="col4"
                    name="HUFFLEPUFF"
                    students={this.state.students}
                />
            </div>
        </div>;
    }
}

export default App;
