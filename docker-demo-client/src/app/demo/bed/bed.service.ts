import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';

@Injectable()
export class BedService {

  constructor(private http: Http) { }

  getAll(): Observable<any> {
    return this.http.get("http://docker-demo-client/beds")
      .map((response: Response) => response.json());
  }

}