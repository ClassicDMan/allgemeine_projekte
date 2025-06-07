import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ButtonModule } from 'primeng/button';
import { CardModule } from 'primeng/card';
import { TableModule } from 'primeng/table';
import { Product } from './interfaces/product';
import { ProductServiceService } from './services/product-service.service';



@Component({
  selector: 'app-root',
  standalone: true,
  imports: [ButtonModule, CardModule, TableModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'primeng-projekt';
  products!: Product[];

  sizes!: any[];

  selectedSize: any = undefined;

  constructor(private productService: ProductServiceService) {}

  ngOnInit() {
      this.productService.getProductsMini().then((data) => {
          this.products = data;
      });

      this.sizes = [
          { name: 'Small', value: 'small' },
          { name: 'Normal', value: undefined },
          { name: 'Large', value: 'large' }
      ];
  }
}
