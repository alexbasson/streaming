import {from} from 'rxjs';
import {stream} from "ndjson-rxjs";

export class SortingHatService {

    streamAll() {
        return stream("http://localhost:8080/api/streaming/students");
    }

    fetchAll() {
        return from(fetch("http://localhost:8080/api/blocking/students")
            .then(response => response.json()));
    }
}
