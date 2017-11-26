import { Component, OnInit } from '@angular/core';
import { BedService } from '../demo/bed/bed.service';

@Component({
  selector: 'app-bed-list',
  templateUrl: './bed-list.component.html',
  styleUrls: ['./bed-list.component.css'],
  providers: [BedService]
})
export class BedListComponent implements OnInit {

  beds: Array<any>;

  constructor(private bedService: BedService) { }

  ngOnInit() {
    this.bedService.getAll().subscribe(
      data => {
        this.beds = data
      },
      error => {
        console.error(error)
      }
    )
  }

}
