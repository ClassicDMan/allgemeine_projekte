import { Component, OnInit } from '@angular/core';
import { ArtikelComponent } from './artikelmenuComponent/artikel/artikel.component';
import { ActivatedRoute, RouterLink } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { WitzService } from '../../services/witz.service';
import { CommonModule } from '@angular/common';

interface Artikel {
  titel: string;
  artikelText: string;
}

interface JsonData {
  logo: string;
  mehrLesenText: string;
}

@Component({
  selector: 'app-artikelmenu',
  standalone: true,
  imports: [RouterLink ,ArtikelComponent, CommonModule], // ArtikelComponent importieren
  templateUrl: './artikelmenu.component.html',
  styleUrls: ['./artikelmenu.component.scss']
})
export class ArtikelmenuComponent implements OnInit {

  mehrLesenButton = '';
  jsonFilePath = 'assets/data/data_source.json';

  articles: Artikel[] = [
    {
      titel: 'Transformation der Arbeit durch die Einführung neuer digitaler Technologien',
      artikelText: ' imawandel, der demografische Wandel und der damit in Verbindungstehende Fachkräftemangel – stellen Unternehmen vor immense Herausforderungen. Bestehende Produkte und Dienstleistungen werden grundlegend infrage gestellt, Absatzmärkte schrumpfen oder fallen gänzlich weg, Energie- bzw. Ressourcenengpässe häufen sich. Sogar in Zeiten des Fachkräftemangels werden betriebliche Bündnisse zur Beschäftigungssicherung vereinbart, Investitionen und Qualifizierung spielen dabei häufig eine Rolle (Pusch und Seifert, 2023). Dies geht vielfach einher mit einer intensivierten Einführung und Nutzung digitaler Technologien',
    },
    {
      titel: 'Zwischen Wahrheit und Täuschung: Wie Technologie im Kampf gegen Desinformation hilft',
      artikelText: 'Soziale Netzwerke fördern den schnellen Informationsaustausch, begünstigen aber auch die Verbreitung von Des- und Fehlinformationen – mit gravierenden Folgen. Technische Ansätze wie die Verwendung von Indikatoren können helfen, Grauzonen im Wahrheitsgehalt zu entschlüsseln und die richtige Einschätzung von Informationen zu erleichtern: eine entscheidende Grundlage für eine widerstandsfähige Demokratie und Gesellschaft.',
    },
    {
      titel: 'Dritter Artikel',
      artikelText: 'Ein dritter Artikel voller aufregender Entdeckungen und nützlicher Tipps. Bleib dran für mehr!',
    }
  ];

  witz: { setup: string; punchline: string } | null = null;

  constructor(private http: HttpClient, private route: ActivatedRoute, private witzService: WitzService) {}

  ngOnInit() {
    this.getMehrLesenText();

    this.route.queryParams.subscribe(params => {
      if (params['titel'] && params['artikelText']) {
        this.articles.push({ 
          titel: params['titel'], 
          artikelText: params['artikelText'] 
        });
      }
    });
    this.loadJoke();

  }

  getMehrLesenText(): void {
    this.http.get<JsonData[]>(this.jsonFilePath).subscribe((data) => {
      if (data.length > 0) {
        this.mehrLesenButton = data[0].mehrLesenText || 'Mehr lesen';
      }
    });
  }

  onNewArticle(article: Artikel) {
    this.articles.push(article);
  }

  shortenText(artikelText: string, maxLength = 200): string {
    if (artikelText.length > maxLength) {
      return artikelText.substring(0, maxLength) + '...';
    }
    return artikelText;
  }

  loadJoke() {
    this.witzService.getRandomJoke().subscribe(
      (data) => {
        console.log('Witz erhalten:', data);
        this.witz = data;
      },
      (error) => {
        console.error('Fehler beim Laden des Witzes:', error);
      }
    );
  }

}