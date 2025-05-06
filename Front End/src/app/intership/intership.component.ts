import { Component } from '@angular/core';

export interface Company {
  name: string;
  projects: number;
  description: string;
  image: string;
  buttonText: string;
  buttonLink: string;
}

@Component({
  selector: 'app-intership',
  templateUrl: './intership.component.html',
  styleUrls: ['./intership.component.css']
})
export class IntershipComponent {
  companies = [
    {
      name: 'EY (Ernst & Young)',
      projects: 74,
      description: `EY est une multinationale renommée spécialisée dans l’audit, le conseil, la fiscalité et les services juridiques. Son environnement dynamique favorise l’innovation, la transformation digitale et les solutions durables, tout en accompagnant les plus grands groupes mondiaux dans leur stratégie de croissance.`,
      image: 'https://logowik.com/content/uploads/images/ey8162.logowik.com.webp',
      buttonText: 'Explorer EY',
      buttonLink: 'https://drive.google.com/drive/u/0/folders/19Ml0fONFgqT68plH_wIK0bsYn5SWiY77'
    },
    {
      name: 'Vermeg',
      projects: 63,
      description: `Vermeg conçoit des solutions logicielles pour les institutions financières et les assureurs. Elle allie expertise métier et puissance technologique pour accompagner la transformation numérique des services bancaires, avec un focus sur la conformité, l'automatisation et la fluidité des opérations.`,
      image: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQhKwI2oBuDcvt2YDYXPGWuKqwXGiwKeU7c2Q&s',
      buttonText: 'Découvrir Vermeg',
      buttonLink: 'https://drive.google.com/drive/u/0/folders/19Ml0fONFgqT68plH_wIK0bsYn5SWiY77'
    },
    {
      name: 'Sofrecom',
      projects: 81,
      description: `Filiale du groupe Orange, Sofrecom est spécialisée dans le conseil et l’ingénierie télécoms. Elle intervient dans des projets stratégiques liés à la connectivité, à la data, au cloud et à l'expérience client, en adoptant une démarche d'innovation responsable et inclusive.`,
      image: 'https://www.sofrecom.com/media/layout/img/sofrecom-meta-logo-small.png',
      buttonText: 'Voir Sofrecom',
      buttonLink: 'https://drive.google.com/drive/u/0/folders/19Ml0fONFgqT68plH_wIK0bsYn5SWiY77'
    },
    {
      name: 'Focus Corporation',
      projects: 59,
      description: `Focus est un acteur de pointe dans le développement logiciel, l’IoT, l’IA et la cybersécurité. Reconnue pour ses projets innovants à forte valeur ajoutée, la société accompagne ses clients dans leur transformation technologique avec des solutions personnalisées et sécurisées.`,
      image: 'https://focus-corporation.com/wp-content/uploads/2022/03/277173466_1802330499978071_1374118157907403705_n.jpg',
      buttonText: 'En savoir plus',
      buttonLink: 'https://drive.google.com/drive/u/0/folders/19Ml0fONFgqT68plH_wIK0bsYn5SWiY77'
    },
    {
      name: 'Instadeep',
      projects: 88,
      description: `Instadeep est une entreprise pionnière en intelligence artificielle et en machine learning. Elle développe des algorithmes avancés pour résoudre des problèmes complexes en bioinformatique, logistique, finance et santé, en collaboration avec Google DeepMind, Nvidia et BioNTech.`,
      image: 'https://ikigai.tn/wp-content/uploads/2023/04/InstaDeep-2.jpg',
      buttonText: 'Explorer Instadeep',
      buttonLink: 'https://drive.google.com/drive/u/0/folders/19Ml0fONFgqT68plH_wIK0bsYn5SWiY77'
    },
    {
      name: 'MASS Analytics',
      projects: 47,
      description: `Spécialisée dans le Marketing Mix Modeling (MMM), MASS Analytics fournit des solutions de data science pour optimiser les investissements marketing. Sa plateforme puissante permet d’analyser, de simuler et de prédire l’impact des campagnes pour maximiser le ROI.`,
      image: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQqfquReAAWOoWBdlfMrPVDhl2_Dw0v5zMggQ&s',
      buttonText: 'Voir MASS',
      buttonLink: 'https://drive.google.com/drive/u/0/folders/19Ml0fONFgqT68plH_wIK0bsYn5SWiY77'
    }
  ];
}
